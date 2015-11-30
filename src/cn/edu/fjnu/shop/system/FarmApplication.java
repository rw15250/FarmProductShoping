package cn.edu.fjnu.shop.system;

import android.content.Context;
import android.content.SharedPreferences;
import cn.edu.fjnu.utils.system.BaseApplication;
import cn.jpush.android.api.JPushInterface;


public class FarmApplication extends BaseApplication {
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
		SharedPreferences sharedPreferences=getSharedPreferences("LoginState",Context.MODE_PRIVATE);
		if(sharedPreferences!=null){
			UserInfo.isLogin=Boolean.parseBoolean( sharedPreferences.getString("login","false"));
			UserInfo.userID=sharedPreferences.getInt("ID",-1);
		}
		UserInfo.isEmptyShopCar=true;
		JPushInterface.init(this);
		
		/*UserInfo.isLogin=Boolean.parseBoolean( sharedPreferences.getString("login","false"));
		UserInfo.userID=Integer.parseInt(sharedPreferences.getString("ID","-1"));*/
	}

}
