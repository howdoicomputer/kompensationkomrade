package com.howdoicomputer.kompensationkomrade;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class kompensationkomradeApplication extends Application<kompensationkomradeConfiguration> {

    public static void main(final String[] args) throws Exception {
        new kompensationkomradeApplication().run(args);
    }

    @Override
    public String getName() {
        return "kompensationkomrade";
    }

    @Override
    public void initialize(final Bootstrap<kompensationkomradeConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final kompensationkomradeConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
