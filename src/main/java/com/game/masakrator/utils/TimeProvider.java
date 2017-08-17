package com.game.masakrator.utils;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class TimeProvider implements Serializable {

	private static final long serialVersionUID = -7529998144957744357L;

	public Date now() {
        return new Date();
    }
}
