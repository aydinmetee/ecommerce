package tr.com.metea.ecommerce.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tr.com.metea.ecommerce.domain.Inventory;
import tr.com.metea.ecommerce.dto.InventorySearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.InventoryWriteDTO;
import tr.com.metea.ecommerce.repository.InventoryRepository;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Service
@RequiredArgsConstructor
public class InventoryServiceImpl extends
        BaseServiceImpl<Inventory, InventoryWriteDTO, InventorySearchCriteriaDTO, InventoryRepository> {
    private final ModelMapper modelMapper;
    @Override
    public Inventory convertToEntity(InventoryWriteDTO dto) {
        return modelMapper.map(dto, Inventory.class);
    }

    @Override
    public Inventory mapDtoToEntity(Inventory entity, InventoryWriteDTO dto) {
        entity.setQuantity(dto.getQuantity());
        return entity;
    }
}
