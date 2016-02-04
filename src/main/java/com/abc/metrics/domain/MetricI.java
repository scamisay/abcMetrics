package com.abc.metrics.domain;

import java.util.Date;

/**
 * Created by scamisay on 27/01/16.
 */
public interface MetricI {

    public Double calculateCurrent();

    public Double calculateHistoric(Date aDate);
}
