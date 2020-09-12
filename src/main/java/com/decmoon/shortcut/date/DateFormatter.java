package com.decmoon.shortcut.date;

import com.decmoon.shortcut.argument.Arguments;
import com.decmoon.shortcut.exception.argument.ParameterIllegalException;
import com.decmoon.shortcut.exception.illegal.InstantiateException;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Date 格式化输出
 * <p>
 * Mybatis date format
 *
 * @author decmoon
 */
public class DateFormatter {

    private DateFormatter() {
        throw new InstantiateException();
    }

    public static LocalDateTime toLocalDateTime(Timestamp timestamp) {
        if (Arguments.parameterIllegal(timestamp)) {
            throw new ParameterIllegalException();
        }
        LocalDateTime localDateTime = timestamp.toLocalDateTime();
        return localDateTime;
    }

    public static LocalDate toLocalDate(Timestamp timestamp) {
        return toLocalDateTime(timestamp).toLocalDate();
    }


}
