package commonsdk.server.mapper;

import commonsdk.server.dto.MessageDTO;
import commonsdk.server.model.Message;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-11-23T14:42:07+0530",
    comments = "version: 1.0.0.Final, compiler: javac, environment: Java 1.8.0_121 (Oracle Corporation)"
)
@Component
public class MessageMapperImpl implements MessageMapper {

    @Override
    public MessageDTO toDTO(Message message) {
        if ( message == null ) {
            return null;
        }

        MessageDTO messageDTO = new MessageDTO();

        messageDTO.setId( message.getId() );
        messageDTO.setUsername( message.getUsername() );
        messageDTO.setPassword( message.getPassword() );
        messageDTO.setTotalbalance( message.getTotalbalance() );

        return messageDTO;
    }

    @Override
    public Message toEntity(MessageDTO message) {
        if ( message == null ) {
            return null;
        }

        Message message_ = new Message();

        message_.setId( message.getId() );
        message_.setUsername( message.getUsername() );
        message_.setPassword( message.getPassword() );
        message_.setTotalbalance( message.getTotalbalance() );

        return message_;
    }

    @Override
    public void mapToEntity(MessageDTO messageDTO, Message message) {
        if ( messageDTO == null ) {
            return;
        }

        message.setId( messageDTO.getId() );
        message.setUsername( messageDTO.getUsername() );
        message.setPassword( messageDTO.getPassword() );
        message.setTotalbalance( messageDTO.getTotalbalance() );
    }
}
