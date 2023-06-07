package com.twiiter.apptwiiterclone.mapper;

import com.twiiter.apptwiiterclone.domain.BaseEntity;
import com.twiiter.apptwiiterclone.payload.BaseDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

public interface GenericMapper<CD extends BaseDTO, UD extends BaseDTO, RD extends BaseDTO, E extends BaseEntity> extends BaseMapper {
    E toEntity(CD dto);

    RD toDTO(E entity);

    List<RD> toListDTO(List<E> entity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    E partialUpdate(UD dto, @MappingTarget E e);

}
