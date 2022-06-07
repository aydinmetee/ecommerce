package tr.com.metea.ecommerce.endpoint;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.metea.ecommerce.domain.Cart;
import tr.com.metea.ecommerce.dto.*;
import tr.com.metea.ecommerce.serviceview.CartDetailServiceView;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@RestController
@RequestMapping("/cart")
@Api(value = "/cart")
@RequiredArgsConstructor
public class CartController extends BaseController<Cart, CartReadDTO, CartWriteDTO, CartSearchCriteriaDTO> {
    private final CartDetailServiceView cartDetailServiceView;


    @PostMapping("/{cartId}/details")
    public ResponseEntity<CartDetailReadDTO> createDetail(@RequestBody CartDetailWriteDTO cartDetailWriteDTO,
                                                          @PathVariable("cartId") String cartId) {
        cartDetailWriteDTO.setCartId(cartId);
        return ResponseEntity.ok(cartDetailServiceView.create(cartDetailWriteDTO));
    }

    @GetMapping("/{cartId}/details/{detailId}")
    public ResponseEntity<CartDetailReadDTO> getByIdDetail(@PathVariable("detailId") String detailId) {
        return ResponseEntity.ok(cartDetailServiceView.getById(detailId));
    }

    @DeleteMapping("/{cartId}/details/{detailId}")
    public ResponseEntity<CartDetailReadDTO> deleteDetail(@PathVariable("detailId") String detailId) {
        return ResponseEntity.ok(cartDetailServiceView.delete(detailId));
    }

    @PostMapping("/{cartId}/details/search")
    public ResponseEntity<Page<CartDetailReadDTO>> searchDetails(@RequestBody() CartDetailSearchCriteriaDTO filter,
                                                                 Pageable pageable) {
        return ResponseEntity.ok(cartDetailServiceView.search(filter, pageable));
    }
}
