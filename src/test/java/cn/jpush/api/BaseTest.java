package cn.jpush.api;

import org.junit.Before;

public abstract class BaseTest {

	protected static final String APP_KEY = "a8364ff617633b8354200331";
    protected static final String MASTER_SECRET = "e6200511ccc46af028546bce";
    protected static final String GROUP_MASTER_SECRET = "b11314807507e2bcfdeebe2e";
    protected static final String GROUP_PUSH_KEY = "2c88a01e073a0fe4fc7b167c";

    public static final String ALERT = "JPush Test - alert";
    public static final String MSG_CONTENT = "JPush Test - msgContent";
    
    public static final String REGISTRATION_ID1 = "13065ffa4e0343f1654";
    public static final String REGISTRATION_ID2 = "13065ffa4e0343f1654";
    public static final String REGISTRATION_ID3 = "170976fa8a8be719873";

    
    protected JPushClient jpushClient = null;
    
    @Before
    public void before() {
        jpushClient = new JPushClient(MASTER_SECRET, APP_KEY);
        
    }

}
