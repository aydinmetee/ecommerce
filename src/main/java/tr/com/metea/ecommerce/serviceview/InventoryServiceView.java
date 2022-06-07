package tr.com.metea.ecommerce.serviceview;

import tr.com.metea.ecommerce.domain.Inventory;
import tr.com.metea.ecommerce.dto.InventoryReadDTO;
import tr.com.metea.ecommerce.dto.InventorySearchCriteriaDTO;
import tr.com.metea.ecommerce.dto.InventoryWriteDTO;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public interface InventoryServiceView extends BaseServiceView<Inventory, InventoryReadDTO, InventoryWriteDTO, InventorySearchCriteriaDTO> {
}
