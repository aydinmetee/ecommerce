package tr.com.metea.ecommerce.serviceview.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tr.com.metea.ecommerce.domain.Discount;
import tr.com.metea.ecommerce.dto.DiscountReadDTO;
import tr.com.metea.ecommerce.dto.DiscountSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.DiscountWriteDTO;
import tr.com.metea.ecommerce.serviceview.DiscountServiceView;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Service
@RequiredArgsConstructor
public class DiscountServiceViewImpl extends
        BaseServiceViewImpl<DiscountReadDTO, DiscountWriteDTO, Discount, DiscountSearchCriteriaDTO>
        implements DiscountServiceView {
    private final ModelMapper modelMapper;

    @Override
    public DiscountReadDTO convertToDTO(Discount discount) {
        return modelMapper.map(discount, DiscountReadDTO.class);
    }
}
