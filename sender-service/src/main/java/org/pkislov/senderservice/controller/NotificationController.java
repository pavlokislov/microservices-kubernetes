package org.pkislov.senderservice.controller;import jakarta.validation.Valid;import lombok.RequiredArgsConstructor;import lombok.extern.slf4j.Slf4j;import org.pkislov.senderservice.dto.MessageDto;import org.pkislov.senderservice.service.NotificationService;import org.springframework.http.HttpStatus;import org.springframework.web.bind.annotation.PostMapping;import org.springframework.web.bind.annotation.RequestBody;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.ResponseStatus;import org.springframework.web.bind.annotation.RestController;@Slf4j@RestController@RequestMapping("/notification")@RequiredArgsConstructorpublic class NotificationController {    private final NotificationService notificationService;    @PostMapping    @ResponseStatus(HttpStatus.CREATED)    public MessageDto postMessage(@RequestBody @Valid MessageDto message) {        log.info("Received POST /notification call with body: {}", message);        return notificationService.placeMessageToQueue(message);    }}