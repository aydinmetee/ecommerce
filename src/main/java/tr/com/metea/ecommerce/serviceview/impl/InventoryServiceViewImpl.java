package tr.com.metea.ecommerce.serviceview.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import tr.com.metea.ecommerce.domain.Inventory;
import tr.com.metea.ecommerce.dto.InventoryReadDTO;
import tr.com.metea.ecommerce.dto.InventorySearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.InventoryWriteDTO;
import tr.com.metea.ecommerce.serviceview.InventoryServiceView;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
@Service
@RequiredArgsConstructor
public class InventoryServiceViewImpl extends
        BaseServiceViewImpl<InventoryReadDTO, InventoryWriteDTO, Inventory, InventorySearchCriteriaDTO>
        implements InventoryServiceView {

    private final ModelMapper modelMapper;

    @Override
    public InventoryReadDTO convertToDTO(Inventory inventory) {
        return modelMapper.map(inventory, InventoryReadDTO.class);
    }
}
