package com.example.charlessin.baby_care;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;


/**
 * 友善商店。
 */
public class ShopActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);


        ArrayList<ShopItem> shoplist = new ArrayList<>();
        shoplist.add(new ShopItem("愛吾兒婦嬰用品百貨", R.drawable.shop_aiwuer));
        shoplist.add(new ShopItem("ECO媽咪 台中總店", R.drawable.shop_ecomami));
        shoplist.add(new ShopItem("花媽婦嬰用品店", R.drawable.shop_fmami));
        shoplist.add(new ShopItem("金寶貝婦幼館 南屯總店", R.drawable.shop_gbaby));
        shoplist.add(new ShopItem("小南國婦幼館 台中五權店", R.drawable.shop_ssc));
        shoplist.add(new ShopItem("嬰兒寶", R.drawable.shopicon));
        shoplist.add(new ShopItem("嬰之房 經貿門市", R.drawable.shop_infant));
        shoplist.add(new ShopItem("聰明媽咪婦嬰用品店", R.drawable.shopicon));
        shoplist.add(new ShopItem("ollobaby 歐羅北鼻 台中草悟道本店", R.drawable.shop_ollobaby));
        shoplist.add(new ShopItem("金寶貝婦幼館 北屯店 中科店", R.drawable.shop_gbaby));
        shoplist.add(new ShopItem("酷咕鴨嬰兒用品旗艦店", R.drawable.shop_kukuduck));
        shoplist.add(new ShopItem("麗兒采家 大墩旗艦店", R.drawable.shop_rear));
        shoplist.add(new ShopItem("寶齡婦幼生活廣場", R.drawable.shop_polin));
        shoplist.add(new ShopItem("愛吾兒婦嬰用品百貨 大里店", R.drawable.shop_aiwuer));
        shoplist.add(new ShopItem("小南國婦幼館 中科店", R.drawable.shop_ssc));
        shoplist.add(new ShopItem("mamawaya媽媽餵", R.drawable.shopicon));
        shoplist.add(new ShopItem("台中中友麗嬰房專櫃", R.drawable.shop_les));
        shoplist.add(new ShopItem("樂浮寶寶 LOVE BABY SPA", R.drawable.shop_lovebaby));
        shoplist.add(new ShopItem("藍色腳ㄚ婦嬰用品店", R.drawable.shop_lovebaby));
        shoplist.add(new ShopItem("小不點嬰童用品", R.drawable.shop_lovebaby));
        shoplist.add(new ShopItem("麗兒采家  河南店", R.drawable.shop_rear));
        shoplist.add(new ShopItem("嬰之房豐原門市", R.drawable.shop_infant));
        shoplist.add(new ShopItem("麗兒采家   進化總店", R.drawable.shop_rear));
        shoplist.add(new ShopItem("小南國婦幼館 太平店", R.drawable.shop_ssc));
        shoplist.add(new ShopItem("麗兒采家  大里國光店", R.drawable.shop_rear));
        shoplist.add(new ShopItem("麗兒采家  烏日店", R.drawable.shop_rear));
        shoplist.add(new ShopItem("寶齡婦幼 文心門市", R.drawable.shop_polin));
        shoplist.add(new ShopItem("寶齡嬰兒用品店  南屯", R.drawable.shop_polin));
        shoplist.add(new ShopItem("飛炫寶寶", R.drawable.shop_flybaby));




        ShopArrayAdapter adapter = new ShopArrayAdapter(this, shoplist);
        ListView lv = findViewById(android.R.id.list);
        lv.setAdapter(adapter);


    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position){
            case 0:
                AlertDialog.Builder ad = new AlertDialog.Builder(this);
                ad.setTitle("愛吾兒婦嬰用品百貨 西屯店");
                ad.setMessage("地址:\n台中市西屯區環中路二段1288-1號\n \n電話:04-2452 5736");
                DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad.setPositiveButton("OK",listener);
                ad.show();
                break;
            case 1:
                AlertDialog.Builder ad1 = new AlertDialog.Builder(this);
                ad1.setTitle("ECO媽咪 台中總店");
                ad1.setMessage("地址:\n台中市西屯區河南路二段53號\n \n電話:04-2315 9968");
                DialogInterface.OnClickListener listener1 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad1.setPositiveButton("OK",listener1);
                ad1.show();
                break;
            case 2:
                AlertDialog.Builder ad2 = new AlertDialog.Builder(this);
                ad2.setTitle("花媽婦嬰用品店");
                ad2.setMessage("地址:\n台中市南屯區東興路一段447號\n \n電話: 0985 482 226");
                DialogInterface.OnClickListener listener2= new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad2.setPositiveButton("OK",listener2);
                ad2.show();
                break;
            case 3:
                AlertDialog.Builder ad3= new AlertDialog.Builder(this);
                ad3.setTitle("金寶貝婦幼館 南屯總店");
                ad3.setMessage("地址:\n台中市南屯區永春東七路681-3號\n \n電話: 04 2381 7533");
                DialogInterface.OnClickListener listener3 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad3.setPositiveButton("OK",listener3);
                ad3.show();
                break;
            case 4:
                AlertDialog.Builder ad4 = new AlertDialog.Builder(this);
                ad4.setTitle("小南國婦幼館 台中五權店");
                ad4.setMessage("地址:\n台中市北區五權路247號\n \n電話:04-2206 5625");
                DialogInterface.OnClickListener listener4 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad4.setPositiveButton("OK",listener4);
                ad4.show();
                break;
            case 5:
                AlertDialog.Builder ad5 = new AlertDialog.Builder(this);
                ad5.setTitle("嬰兒寶");
                ad5.setMessage("地址:\n台中市太平區中山路四段82-2號\n  \n電話:04-2395 2229");
                DialogInterface.OnClickListener listener5 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad5.setPositiveButton("OK",listener5);
                ad5.show();
                break;
            case 6:
                AlertDialog.Builder ad6 = new AlertDialog.Builder(this);
                ad6.setTitle("嬰之房 經貿門市");
                ad6.setMessage("地址:\n台中市北屯區經貿一路130-1號\n\n電話:04-2298 8575");
                DialogInterface.OnClickListener listener6 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad6.setPositiveButton("OK",listener6);
                ad6.show();
                break;
            case 7:
                AlertDialog.Builder ad7 = new AlertDialog.Builder(this);
                ad7.setTitle("聰明媽咪婦嬰用品店");
                ad7.setMessage("地址:\n台中市北區中清路一段317號\n \n電話:04-2208 3939");
                DialogInterface.OnClickListener listener7 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad7.setPositiveButton("OK",listener7);
                ad7.show();
                break;
            case 8:
                AlertDialog.Builder ad8 = new AlertDialog.Builder(this);
                ad8.setTitle("ollobaby 歐羅北鼻 台中草悟道本店");
                ad8.setMessage("地址:\n台中市西區公正路115號\n\n電話: 04-2305 5693");
                DialogInterface.OnClickListener listener8 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad8.setPositiveButton("OK",listener8);
                ad8.show();
                break;
            case 9:
                AlertDialog.Builder ad9 = new AlertDialog.Builder(this);
                ad9.setTitle("金寶貝婦幼館 北屯店");
                ad9.setMessage("地址:\n台中市北屯區文心路四段772號\n\n電話: 04-2236 0499");
                DialogInterface.OnClickListener listener9 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad9.setPositiveButton("OK",listener9);
                ad9.show();
                break;
            case 10:
                AlertDialog.Builder ad10 = new AlertDialog.Builder(this);
                ad10.setTitle("酷咕鴨嬰兒用品旗艦店");
                ad10.setMessage("地址:\n台中市西屯區大隆路66號\n \n電話:04-2326 8521");
                DialogInterface.OnClickListener listener10 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad10.setPositiveButton("OK",listener10);
                ad10.show();
                break;
            case 11:
                AlertDialog.Builder ad11 = new AlertDialog.Builder(this);
                ad11.setTitle("麗兒采家 大墩旗艦店");
                ad11.setMessage("地址:\n台中市南屯區向上路一段604號\n \n電話:2326 3196");
                DialogInterface.OnClickListener listener11 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad11.setPositiveButton("OK",listener11);
                ad11.show();
                break;
            case 12:
                AlertDialog.Builder ad12 = new AlertDialog.Builder(this);
                ad12.setTitle("寶齡婦幼生活廣場");
                ad12.setMessage("地址:\n台中市西區美村路一段260號\n \n電話:04-2301 1120");
                DialogInterface.OnClickListener listener12 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad12.setPositiveButton("OK",listener12);
                ad12.show();
                break;
            case 13:
                AlertDialog.Builder ad13 = new AlertDialog.Builder(this);
                ad13.setTitle("愛吾兒婦嬰用品百貨 大里店");
                ad13.setMessage("地址:\n台中市大里區國光路一段121號\n \n電話:042406 9898");
                DialogInterface.OnClickListener listener13 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad13.setPositiveButton("OK",listener13);
                ad13.show();
                break;
            case 14:
                AlertDialog.Builder ad14 = new AlertDialog.Builder(this);
                ad14.setTitle("小南國婦幼館 中科店");
                ad14.setMessage("地址:\n台中市西屯區福林路388號\n \n電話:04-2461 3749");
                DialogInterface.OnClickListener listener14 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad14.setPositiveButton("OK",listener14);
                ad14.show();
                break;
            case 15:
                AlertDialog.Builder ad15 = new AlertDialog.Builder(this);
                ad15.setTitle("mamawaya媽媽餵");
                ad15.setMessage("地址:\n台中市北屯區文心路四段552號1樓\n \n電話:04- 2234 0752");
                DialogInterface.OnClickListener listener15 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad15.setPositiveButton("OK",listener15);
                ad15.show();
                break;
            case 16:
                AlertDialog.Builder ad16 = new AlertDialog.Builder(this);
                ad16.setTitle("台中中友麗嬰房專櫃");
                ad16.setMessage("地址:\n台中市北區三民路三段161號號 c 棟 7f\n \n電話:04-2223 4903");
                DialogInterface.OnClickListener listener16 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad16.setPositiveButton("OK",listener16);
                ad16.show();
                break;
            case 17:
                AlertDialog.Builder ad17 = new AlertDialog.Builder(this);
                ad17.setTitle("樂浮寶寶 LOVE BABY SPA");
                ad17.setMessage("地址:\n台中市北區英才路288號\n \n電話:04- 2203 8613");
                DialogInterface.OnClickListener listener17 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad17.setPositiveButton("OK",listener17);
                ad17.show();
                break;
            case 18:
                AlertDialog.Builder ad18 = new AlertDialog.Builder(this);
                ad18.setTitle("藍色腳ㄚ婦嬰用品店");
                ad18.setMessage("地址:\n台中市北屯區松竹路二段227號\n\n \n電話:04-2243 6301");
                DialogInterface.OnClickListener listener18 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad18.setPositiveButton("OK",listener18);
                ad18.show();
                break;
            case 19:
                AlertDialog.Builder ad19 = new AlertDialog.Builder(this);
                ad19.setTitle("小不點嬰童用品");
                ad19.setMessage("地址:\n台中市北屯區北屯路64號\n\n \n電話:0956 998 138");
                DialogInterface.OnClickListener listener19 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad19.setPositiveButton("OK",listener19);
                ad19.show();
                break;
            case 21:
                AlertDialog.Builder ad20 = new AlertDialog.Builder(this);
                ad20.setTitle("麗兒采家  河南店");
                ad20.setMessage("地址:\n台中市西屯區河南路二段500號\n\n \n電話:04-2708 4159");
                DialogInterface.OnClickListener listener20 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad20.setPositiveButton("OK",listener20);
                ad20.show();
                break;
            case 22:
                AlertDialog.Builder ad22 = new AlertDialog.Builder(this);
                ad22.setTitle("嬰之房豐原門市");
                ad22.setMessage("地址:\n台中市豐原區圓環東路315號\n\n \n電話:04-2515 9196");
                DialogInterface.OnClickListener listener22 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad22.setPositiveButton("OK",listener22);
                ad22.show();
                break;
            case 23:
                AlertDialog.Builder ad23 = new AlertDialog.Builder(this);
                ad23.setTitle("麗兒采家   進化總店");
                ad23.setMessage("地址:\n台中市北屯區進化北路55-1號\n\n \n電話:04-2235 4443");
                DialogInterface.OnClickListener listener23 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad23.setPositiveButton("OK",listener23);
                ad23.show();
                break;
            case 24:
                AlertDialog.Builder ad24 = new AlertDialog.Builder(this);
                ad24.setTitle("小南國婦幼館 太平店");
                ad24.setMessage("地址:\n台中市太平區中興路68號\n\n \n電話:04-2279 6353");
                DialogInterface.OnClickListener listener24 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad24.setPositiveButton("OK",listener24);
                ad24.show();
                break;
            case 25:
                AlertDialog.Builder ad25 = new AlertDialog.Builder(this);
                ad25.setTitle("麗兒采家  大里國光店");
                ad25.setMessage(" 地址:\n台中市北屯區松竹路二段227號\n\n \n電話:04-2243 6301");
                DialogInterface.OnClickListener listener25 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad25.setPositiveButton("OK",listener25);
                ad25.show();
                break;
            case 26:
                AlertDialog.Builder ad26 = new AlertDialog.Builder(this);
                ad26.setTitle("麗兒采家  烏日店");
                ad26.setMessage("地址:\n台中市烏日區中山路二段110號\n\n \n電話:04-2338 8501");
                DialogInterface.OnClickListener listener26 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad26.setPositiveButton("OK",listener26);
                ad26.show();
                break;
            case 27:
                AlertDialog.Builder ad27 = new AlertDialog.Builder(this);
                ad27.setTitle("寶齡婦幼 文心門市");
                ad27.setMessage(" 地址:\n台中市西屯區文心路三段91-6號\n\n \n電話:04-2313 8818");
                DialogInterface.OnClickListener listener27 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad27.setPositiveButton("OK",listener27);
                ad27.show();
                break;
            case 28:
                AlertDialog.Builder ad28 = new AlertDialog.Builder(this);
                ad28.setTitle("寶齡嬰兒用品店  南屯");
                ad28.setMessage(" 地址:\n台中市南屯區黎明路一段1016號\n\n \n電話:04-2381 2782");
                DialogInterface.OnClickListener listener28 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad28.setPositiveButton("OK",listener28);
                ad28.show();
                break;
            case 29:
                AlertDialog.Builder ad29 = new AlertDialog.Builder(this);
                ad29.setTitle("飛炫寶寶");
                ad29.setMessage("地址:\n 台中市南屯區大業路229號\n\n \n電話:04-2326 3336");
                DialogInterface.OnClickListener listener29 = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                };
                ad29.setPositiveButton("OK",listener29);
                ad29.show();
                break;

        }


    }
}

