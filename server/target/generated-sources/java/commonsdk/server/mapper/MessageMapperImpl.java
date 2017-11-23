package commonsdk.server.mapper;

import commonsdk.server.dto.MessageDTO;
import commonsdk.server.model.Message;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-11-23T11:01:49+0530",
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
        messageDTO.setFirstname( message.getFirstname() );
        messageDTO.setLastname( message.getLastname() );
        messageDTO.setAge( message.getAge() );

        return messageDTO;
    }

    @Override
    public Message toEntity(MessageDTO message) {
        if ( message == null ) {
            return null;
        }

        Message message_ = new Message();

        message_.setId( message.getId() );
        message_.setFirstname( message.getFirstname() );
        message_.setLastname( message.getLastname() );
        message_.setAge( message.getAge() );

        return message_;
    }

    @Override
    public void mapToEntity(MessageDTO messageDTO, Message message) {
        if ( messageDTO == null ) {
            return;
        }

        message.setId( messageDTO.getId() );
        message.setFirstname( messageDTO.getFirstname() );
        message.setLastname( messageDTO.getLastname() );
        message.setAge( messageDTO.getAge() );
    }
}
