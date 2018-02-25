package com.wechat.getuserinfo;

import com.wechat.utils.weChatUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	//构造函数由小程序端传送
    	weChatUtils wechatutil = new weChatUtils("011mjbof1wmnTy0gbLpf1yUUnf1mjbox");
    	try {
			System.out.println(wechatutil.analyzeEncryptedData("t2R2eejRP3JRkOVYqmiXG9XpI1PxBssvBTLEos31mecYKH2lqnTErupBvFxXXoqWmqbgrZhUBGWph+zh9j2QPXmla/tbyxCgHXXNsHkiU5MiJofk7bluPKMGSwOtgZqiouq6QbQ0PirVjaRnihkLHH8t+Fn6X3Zow68YpspUQjxi37jUIfwvvI7ZnoRqEaaP7cgcz2ZFeuDQp5CbFhYJaIm1kGJb4LBmX58iMERv5ZNuYuUvCQdL7OFFvL/0xRYuezKJXlQMCMpKrrJ/odflH1HuMQbxMr+p/8aAy5o7lovwAi7f1F4is+P1ZDCG73n3twyWYigf/NJRWtiyjMIMlRcmSyQjHZKjQzYyy3FSSw+RQf5ySxjbW2fZRNDHJY+j/RrKyQ9TlfBAzRJCGs+JwwjlIvmnwyYd+9IyyZJ9KpXzEl7LQ9wjD3zhhqS8Z5LD0ir4loCM4OjXPw4t2vrM5+5UejDq2CfFanmzcc6gosEsHMeho4V7uwlsUVjzxUr6"
					, "OUZUhufE70cMinWDomiWlQ=="));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}
    }
}
