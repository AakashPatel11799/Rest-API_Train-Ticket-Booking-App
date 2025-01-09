package in.aakash.response;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticket {
	private Integer ticketId;
	private String ticketStatus;
	private String ticketPrice;
	private String from;
	private String to;
	private String trainNum;
	private String doj;
}
