package com.osiki.Boot_CRUD.service;

import com.osiki.Boot_CRUD.payload.request.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
