package tr.com.metea.ecommerce.endpoint;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.metea.ecommerce.domain.Inventory;
import tr.com.metea.ecommerce.dto.InventoryReadDTO;
import tr.com.metea.ecommerce.dto.InventorySearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.InventoryWriteDTO;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@RestController
@RequestMapping("/inventory")
@Api(value = "/inventory")
public class InventoryController extends
        BaseController<Inventory, InventoryReadDTO, InventoryWriteDTO, InventorySearchCriteriaDTO> {
}
