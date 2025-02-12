package org.pkislov.visualizerservice.service;import lombok.RequiredArgsConstructor;import org.pkislov.visualizerservice.dto.MessageDto;import org.pkislov.visualizerservice.repository.MessageRepository;import org.springframework.stereotype.Service;import java.util.ArrayList;import java.util.List;@Service@RequiredArgsConstructorpublic class MessageService {    private final MessageRepository messageRepository;    public List<MessageDto> getMessages(){        List<MessageDto> messages = new ArrayList<>();        messageRepository.findAll().forEach(entity -> {            MessageDto messageDto = new MessageDto();            messageDto.setId(entity.getId());            messageDto.setMessage(entity.getMessage());            messageDto.setUser(entity.getUsername());            messages.add(messageDto);        });        return messages;    }}