/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.alerts.transport.actions.update;

import org.elasticsearch.action.ActionResponse;
import org.elasticsearch.common.io.stream.StreamInput;
import org.elasticsearch.common.io.stream.StreamOutput;

import java.io.IOException;

/**
 */
public class UpdateAlertResponse extends ActionResponse {
    private boolean success = false;

    public UpdateAlertResponse() {

    }

    public UpdateAlertResponse(boolean success) {
        this.success = success;
    }

    public boolean success() {
        return success;
    }

    public void success(boolean success) {
        this.success = success;
    }

    @Override
    public void readFrom(StreamInput in) throws IOException {
        super.readFrom(in);
        success = in.readBoolean();
    }

    @Override
    public void writeTo(StreamOutput out) throws IOException {
        super.writeTo(out);
        out.writeBoolean(success);
    }

}
