package com.sandp.simpackages;

import android.animation.Animator;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PackagesAdapter extends ArrayAdapter<Packages> {
    public int counter = 0;

    public PackagesAdapter(Activity context, ArrayList<Packages> packages) {
        super(context, 0, packages);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Packages currentPackage = getItem(position);


        TextView packageTitleTextView = (TextView) listItemView.findViewById(R.id.package_title);
        packageTitleTextView.setText(currentPackage.getTitle());


        TextView durationDetailsTitleTextView = (TextView) listItemView.findViewById(R.id.duration_info);
        durationDetailsTitleTextView.setText(currentPackage.getDurationDetails());


        TextView volumeInfoTextView = (TextView) listItemView.findViewById(R.id.volume_info);
        volumeInfoTextView.setText(currentPackage.getVolumeInfo());


        TextView priceInfoTextView = (TextView) listItemView.findViewById(R.id.price_info);
        priceInfoTextView.setText(currentPackage.getPriceDetails());


        TextView activationInfoTextView = (TextView) listItemView.findViewById(R.id.activation_info);
        activationInfoTextView.setText(currentPackage.getActivationDetails());


        TextView deactivationInfoTextView = (TextView) listItemView.findViewById(R.id.deactivation_info);
        deactivationInfoTextView.setText(currentPackage.getDeactivationDetails());

        TextView remainingInfoTextView = (TextView) listItemView.findViewById(R.id.remaining_info);
        remainingInfoTextView.setText(currentPackage.getRemainingDetails());

        final Button activateButton = (Button) listItemView.findViewById(R.id.activate_button);
        final Button deactivateButton = (Button) listItemView.findViewById(R.id.deactiviate_button);
        final String onDial = currentPackage.getActivationDetails();
        final String onDial2 = currentPackage.getDeactivationDetails();



//        final LinearLayout row1 = (LinearLayout) listItemView.findViewById(R.id.row_1);

        activateButton.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View view) {

                                                  if (onDial.toString().contains("#")) {
                                                      Intent intent = new Intent(Intent.ACTION_DIAL);
                                                      intent.setData(Uri.fromParts("tel", onDial, "#"));
                                                      getContext().startActivity(intent);
                                                  } else {
                                                      Toast.makeText(getContext(),"Action Not Available",Toast.LENGTH_SHORT).show();
                                                  }
                                              }
                                          }
        );

        deactivateButton.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View view) {


                                                    if (onDial2.toString().contains("#")) {
                                                        Intent intent = new Intent(Intent.ACTION_DIAL);
                                                        intent.setData(Uri.fromParts("tel", onDial2, "#"));
                                                        getContext().startActivity(intent);
                                                    } else {
                                                        Toast.makeText(getContext(),"Action Not Available",Toast.LENGTH_SHORT).show();
                                                    }

                                                }
                                            }
        );

        final Button detailsButton = (Button) listItemView.findViewById(R.id.details_button);

        final View finalListItemView = listItemView;
        detailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter == 0) {
                    counter = 1;

                    LinearLayout row1 = (LinearLayout) finalListItemView.findViewById(R.id.row_1);
                    LinearLayout row2 = (LinearLayout) finalListItemView.findViewById(R.id.row_2);
                    LinearLayout row3 = (LinearLayout) finalListItemView.findViewById(R.id.row_3);
                    expand(row1);
                    expand(row2);
                    detailsButton.setText("Summary");
                    expand(row3);

                } else if (counter == 1) {
                    counter = 0;
                    LinearLayout row1 = (LinearLayout) finalListItemView.findViewById(R.id.row_1);
                    LinearLayout row2 = (LinearLayout) finalListItemView.findViewById(R.id.row_2);
                    LinearLayout row3 = (LinearLayout) finalListItemView.findViewById(R.id.row_3);
                    collapse(row3);
                    collapse(row2);
                    collapse(row1);
                    detailsButton.setText("Detail");
                }
            }
        });

        return listItemView;
    }

    public static void expand(final View v) {
        v.measure(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        final int targetHeight = v.getMeasuredHeight();

        // Older versions of android (pre API 21) cancel animations for views with a height of 0.
        v.getLayoutParams().height = 1;
        v.setVisibility(View.VISIBLE);
        Animation a = new Animation() {
            @Override
            protected void applyTransformation(float interpolatedTime, Transformation t) {
                v.getLayoutParams().height = interpolatedTime == 1
                        ? LayoutParams.WRAP_CONTENT
                        : (int) (targetHeight * interpolatedTime);
                v.requestLayout();
            }

            @Override
            public boolean willChangeBounds() {
                return true;
            }
        };
        a.setDuration((int)((targetHeight*8) / v.getContext().getResources().getDisplayMetrics().density));
        v.startAnimation(a);

    }

    public static void collapse(final View v) {
        final int initialHeight = v.getMeasuredHeight();

        Animation a = new Animation()
        {
            @Override
            protected void applyTransformation(float interpolatedTime, Transformation t) {
                if(interpolatedTime == 1){
                    v.setVisibility(View.GONE);
                }else{
                    v.getLayoutParams().height = initialHeight - (int)(initialHeight * interpolatedTime);
                    v.requestLayout();
                }
            }

            @Override
            public boolean willChangeBounds() {
                return true;
            }
        };

        // 1dp/ms
        a.setDuration((int)((initialHeight*8) / v.getContext().getResources().getDisplayMetrics().density));
        v.startAnimation(a);
    }
}