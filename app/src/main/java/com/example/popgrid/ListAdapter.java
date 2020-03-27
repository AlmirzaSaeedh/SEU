package com.example.popgrid;


public class ListAdapter
        //extends ArrayAdapter
{

/*    private final Activity context;
    private final String[] crn;
    private final int[] date;
    private final String[] time;

    public ListAdapter(Activity context, String[] crns, int[] dates, String[] times) {
         super(context,R.layout.listcontent , crns);
         this.context=context;
         this.crn=crns;
         this.date=dates;
         this.time=times;
    }

    @Override
    public int getCount() {
        return Datalist.size();
    }

    @Override
    public Object getItem(int position) {
        return Datalist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View view, ViewGroup parent) {
      LayoutInflater inflater=context.getLayoutInflater();
        View Item =inflater.inflate(R.layout.listcontent, null,true);

        TextView test2 = Item.findViewById(R.id.txtvcrn);
          EditText edtxt = Item.findViewById(R.id.txtdate);
            EditText edtxt2 = Item.findViewById(R.id.txttime);
            test2.setText(crn[position]);
            edtxt.setText(date[position]);
              edtxt2.setText(time[position]);


        Item.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                grid = inflater.inflate(R.layout.gridv, null);
                TextView textView = (TextView) grid.findViewById(R.id.textV);
                textView.setOnClickListener(activity);
            }
        });

        return Item;



    }; */
}
