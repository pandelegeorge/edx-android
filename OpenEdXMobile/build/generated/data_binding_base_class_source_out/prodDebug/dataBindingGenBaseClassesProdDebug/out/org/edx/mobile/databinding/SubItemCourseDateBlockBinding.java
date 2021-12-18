package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class SubItemCourseDateBlockBinding extends ViewDataBinding {
  @NonNull
  public final TextView description;

  @NonNull
  public final TextView title;

  protected SubItemCourseDateBlockBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView description, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.description = description;
    this.title = title;
  }

  @NonNull
  public static SubItemCourseDateBlockBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SubItemCourseDateBlockBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SubItemCourseDateBlockBinding>inflate(inflater, org.edx.mobile.R.layout.sub_item_course_date_block, root, attachToRoot, component);
  }

  @NonNull
  public static SubItemCourseDateBlockBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SubItemCourseDateBlockBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SubItemCourseDateBlockBinding>inflate(inflater, org.edx.mobile.R.layout.sub_item_course_date_block, null, false, component);
  }

  public static SubItemCourseDateBlockBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SubItemCourseDateBlockBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SubItemCourseDateBlockBinding)bind(component, view, org.edx.mobile.R.layout.sub_item_course_date_block);
  }
}
