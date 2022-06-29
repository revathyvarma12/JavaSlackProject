import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;

import java.io.IOException;

public class JavaSlack {

    public static void main (String[] args)
    {
        StringBuilder br=new StringBuilder();
        br.append("This is to post in slack channel");

        String webhook="your web hook";
        Payload payload=Payload.builder().channel("#channel name").text(br.toString()).build();
        try {
            WebhookResponse wbr=Slack.getInstance().send(webhook,payload);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
