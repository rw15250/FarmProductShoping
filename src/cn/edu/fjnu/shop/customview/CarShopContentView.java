/**
 * 
 */
package cn.edu.fjnu.shop.customview;

import cn.edu.fjnu.shop.R;
import cn.edu.fjnu.utils.OPUtils;
import cn.edu.fjnu.utils.SizeUtils;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author GaoFei
 *
 */
public class CarShopContentView extends LinearLayout{

	public boolean isSelected=false;
	public int index=-1;
	public CarShopContentView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		//addv
		LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,SizeUtils.dp2px(150));
		layoutParams.topMargin=SizeUtils.dp2px(10);
		layoutParams.bottomMargin=SizeUtils.dp2px(10);
		addView(creatView(context),layoutParams);
	}

	
	public CarShopContentView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,SizeUtils.dp2px(150));
		layoutParams.topMargin=SizeUtils.dp2px(10);
		layoutParams.bottomMargin=SizeUtils.dp2px(10);
		addView(creatView(context),layoutParams);
	}
	
	public View creatView(Context context){
		LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    return layoutInflater.inflate(R.layout.package_carshop_content,null);
		//return null;
	}
}
