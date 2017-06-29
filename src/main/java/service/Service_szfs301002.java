package service;

import com.whaim.DataParser;
import com.whaim.Datagram;
import com.whaim.IService;
import szfs.std.szfs._2010.tech.xsd.szfs_301_002.Document;

/**
 * Created by whaim on 2017/6/28.
 */
public class Service_szfs301002 implements IService{

    //message type
    private static final String msgType="301.002";
    private Datagram<Document> doc=new Datagram<>();
    private DataParser<Document> parser= new DataParser<>();

    @Override
    public String getMessageTye() {
        return msgType;
    }

    @Override
    public void process(byte[] msg) {


        parser.setNamespace("szfs.std.szfs._2010.tech.xsd.szfs_301_002");
        doc=parser.parser(msg);

        System.out.println(doc.getDocument().getPmtByAgcy().getPmtByAgcyInf().getCdtr().getId());
        return;
    }
}
