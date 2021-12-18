package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import org.edx.mobile.interfaces.OnDateBlockListener;
import org.edx.mobile.model.course.CourseDateBlock;

public abstract class ItemCourseDateBlockBinding extends ViewDataBinding {
  @NonNull
  public final View bullet;

  @NonNull
  public final View bulletToday;

  @NonNull
  public final TextView date;

  @NonNull
  public final LinearLayout dateInfoContainer;

  @NonNull
  public final ConstraintLayout itemContainer;

  @NonNull
  public final View lineAboveDot;

  @NonNull
  public final View lineBelowDot;

  @Bindable
  protected CourseDateBlock mDateBlock;

  @Bindable
  protected OnDateBlockListener mDateItemListener;

  @Bindable
  protected ArrayList<CourseDateBlock> mDateBlockList;

  protected ItemCourseDateBlockBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View bullet, View bulletToday, TextView date,
      LinearLayout dateInfoContainer, ConstraintLayout itemContainer, View lineAboveDot,
      View lineBelowDot) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bullet = bullet;
    this.bulletToday = bulletToday;
    this.date = date;
    this.dateInfoContainer = dateInfoContainer;
    this.itemContainer = itemContainer;
    this.lineAboveDot = lineAboveDot;
    this.lineBelowDot = lineBelowDot;
  }

  public abstract void setDateBlock(@Nullable CourseDateBlock dateBlock);

  @Nullable
  public CourseDateBlock getDateBlock() {
    return mDateBlock;
  }

  public abstract void setDateItemListener(@Nullable OnDateBlockListener dateItemListener);

  @Nullable
  public OnDateBlockListener getDateItemListener() {
    return mDateItemListener;
  }

  public abstract void setDateBlockList(@Nullable ArrayList<CourseDateBlock> dateBlockList);

  @Nullable
  public ArrayList<CourseDateBlock> getDateBlockList() {
    return mDateBlockList;
  }

  @NonNull
  public static ItemCourseDateBlockBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemCourseDateBlockBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemCourseDateBlockBinding>inflate(inflater, org.edx.mobile.R.layout.item_course_date_block, root, attachToRoot, component);
  }

  @NonNull
  public static ItemCourseDateBlockBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemCourseDateBlockBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemCourseDateBlockBinding>inflate(inflater, org.edx.mobile.R.layout.item_course_date_block, null, false, component);
  }

  public static ItemCourseDateBlockBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemCourseDateBlockBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemCourseDateBlockBinding)bind(component, view, org.edx.mobile.R.layout.item_course_date_block);
  }
}
