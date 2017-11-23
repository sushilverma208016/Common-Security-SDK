package commonsdk.server.service;

import commonsdk.server.dto.MessageDTO;
import commonsdk.server.dto.TransferRequestDTO;
import commonsdk.server.mapper.MessageMapper;
import commonsdk.server.model.Message;
import commonsdk.server.repository.MessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class MessageServiceImpl implements MessageService {

    final static Logger LOG = LoggerFactory.getLogger(MessageServiceImpl.class);

    @Autowired
    MessageRepository messageRepository;

    @Autowired
    MessageMapper messageMapper;

    @Override
    public Page<MessageDTO> findMessages(Pageable pageable) {
        return messageRepository.findAll(pageable).map(message -> messageMapper.toDTO(message));
    }

    @Override
    public MessageDTO getMessage(Long id) {
        Message message = messageRepository.getOne(id);
        if (message == null) {
            return null;
        } else {
            return messageMapper.toDTO(message);
        }
    }

    @Override
    public void updateMessage(MessageDTO messageDTO) {
        Message message = messageRepository.findOne(messageDTO.getId());
        messageMapper.mapToEntity(messageDTO, message);
    }

    @Override
    public void saveMessage(MessageDTO messageDTO) {
        Message message = messageMapper.toEntity(messageDTO);
        messageRepository.save(message);
    }

    @Override
    public void deleteMessage(Long id) {
        messageRepository.delete(id);
    }

    @Override
    public Message tranferMoney(TransferRequestDTO transferRequestDTO) {
        Message fromAccount = messageRepository.findOne(Long.valueOf(transferRequestDTO.getFromAccount()));
        Message toAccount = messageRepository.findOne(Long.valueOf(transferRequestDTO.getToAccount()));
        fromAccount.setTotalbalance(fromAccount.getTotalbalance() - transferRequestDTO.getAmount());
        toAccount.setTotalbalance(toAccount.getTotalbalance() + transferRequestDTO.getAmount());
        fromAccount.setLastaccount(transferRequestDTO.getToAccount());
        messageRepository.save(fromAccount);
        messageRepository.save(toAccount);
        return fromAccount;
    }
}
