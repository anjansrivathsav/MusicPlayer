package androidmock.com.multiple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by kotha on 23-Jan-17.
 */

public class HeadActivity extends Activity {
    ArrayAdapter<String> adp;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
          setContentView(R.layout.first);
        ListView lv=(ListView)findViewById(R.id.lv);

        String [] s={"nenulocal","majnu","kidino150"};

        adp=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,s);
    lv.setAdapter(adp);
    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent i=new Intent(HeadActivity.this,SecondActivity.class);
             if(position==0)
             {
                 String str="0";
                 i.putExtra("NAME",str);
             }
            if(position==1)
            {
                String str="1";
                i.putExtra("NAME",str);
            }
            if(position==2)
            {
                String str="2";
                i.putExtra("NAME",str);
            }
            startActivity(i);
        }
    });
    }
}
