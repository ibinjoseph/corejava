interface SocialFeedReader
{
	public Message pollForNewMassage();
}
class Message
{
	
	int messageId;
	String messageSource;
	String messagetype;
	String StringType;
	String SenderInfo;
	public String getSenderInfo() {
		return SenderInfo;
	}
	public void setSenderInfo(String senderInfo) {
		SenderInfo = senderInfo;
	}
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(String messageSource) {
		this.messageSource = messageSource;
	}
	public String getMessagetype() {
		return messagetype;
	}
	public void setMessagetype(String messagetype) {
		this.messagetype = messagetype;
	}
	public String getStringType() {
		return StringType;
	}
	public void setStringType(String stringType) {
		StringType = stringType;
	}
	
	
}
class TwitterFeedReader implements SocialFeedReader
{

	@Override
	public Message pollForNewMassage() {
		// TODO Auto-generated method stub
	Message m=new Message();
	m.setMessageId(1);
	m.setMessageSource("Twitter");
	m.setMessagetype("String");
	m.setStringType("Tweeting");
	m.setSenderInfo("Abhi");
	
	return m;
	}
	
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TwitterFeedReader t = new TwitterFeedReader();
Message m=t.pollForNewMassage();
System.out.println(m.getMessageId());
System.out.println(m.getMessageSource());
System.out.println(m.getMessagetype());
System.out.println(m.getStringType());
System.out.println(m.getSenderInfo());
FacebookReader f=new FacebookReader();
Message m1=f.pollForNewMassage();
System.out.println(m1.getMessageId());
System.out.println(m1.getMessageSource());
System.out.println(m1.getMessagetype());
System.out.println(m1.getStringType());
System.out.println(m1.SenderInfo);


	}

}
