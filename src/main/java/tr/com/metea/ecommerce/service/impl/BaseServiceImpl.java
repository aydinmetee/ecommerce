package tr.com.metea.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tr.com.metea.ecommerce.dto.BaseSearchCriteriaDTO;
import tr.com.metea.ecommerce.exception.ServiceExecutionException;
import tr.com.metea.ecommerce.service.BaseService;

/**
 * @author Mete Aydin
 * @since 7.06.2022
 */
public abstract class BaseServiceImpl<E, W, S extends BaseSearchCriteriaDTO<E>, R extends JpaRepository<E, String> & JpaSpecificationExecutor<E>>
        implements BaseService<E, W, S> {

    @Autowired
    R repository;

    public E create(W dto) {
        return repository.save(convertToEntity(dto));
    }

    public E update(String id, W dto) {
        final var entity = getById(id);
        return repository.save(mapDtoToEntity(entity, dto));
    }

    public E getById(String id) {
        final var entity = repository.findById(id);
        if (entity.isEmpty()) {
            throw new ServiceExecutionException("Kayıt Bulunamadı!");
        }
        return entity.get();
    }

    public E delete(String id) {
        final var entity = getById(id);
        repository.delete(entity);
        return entity;
    }

    public Page<E> search(S criteria, Pageable pageable) {
        return repository.findAll(criteria.criteriaFieldMapper(), pageable);
    }

    // This Function Must Be Writen.
    public E convertToEntity(W dto) {
        return null;
    }

    // This Function Must Be Writen.
    public E mapDtoToEntity(E entity, W dto) {
        return null;
    }


}
