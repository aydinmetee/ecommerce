package tr.com.metea.ecommerce.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tr.com.metea.ecommerce.domain.Discount;
import tr.com.metea.ecommerce.dto.DiscountSearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.DiscountWriteDTO;
import tr.com.metea.ecommerce.service.DiscountService;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Service
@RequiredArgsConstructor
public class DiscountServiceImpl extends BaseServiceImpl<Discount, DiscountWriteDTO, DiscountSearchCriteriaDTO> implements DiscountService {
    private final ModelMapper modelMapper;

    @Override
    public Discount convertToEntity(DiscountWriteDTO dto) {
        return modelMapper.map(dto, Discount.class);
    }

    @Override
    public Discount mapDtoToEntity(Discount entity, DiscountWriteDTO dto) {
        entity.setDescription(dto.getDescription());
        entity.setName(dto.getName());
        entity.setRatio(dto.getRatio());
        entity.setValid(dto.getValid());
        return entity;
    }
}
