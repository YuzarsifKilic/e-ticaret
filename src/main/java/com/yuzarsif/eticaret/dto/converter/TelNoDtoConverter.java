package com.yuzarsif.eticaret.dto.converter;

import com.yuzarsif.eticaret.dto.model.TelNoDto;
import com.yuzarsif.eticaret.model.TelNo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TelNoDtoConverter {

    public TelNoDto convert(TelNo from) {
        return new TelNoDto(
                from.getId(),
                from.getTelNo(),
                from.getTelNoType());
    }
}
