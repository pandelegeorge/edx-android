package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import org.edx.mobile.view.custom.IconImageViewXml;

public abstract class FragmentLockedCourseUnitBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final IconImageViewXml lock;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView tvHeader;

  protected FragmentLockedCourseUnitBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, FrameLayout fragmentContainer, IconImageViewXml lock, TextView textView,
      TextView tvHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fragmentContainer = fragmentContainer;
    this.lock = lock;
    this.textView = textView;
    this.tvHeader = tvHeader;
  }

  @NonNull
  public static FragmentLockedCourseUnitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentLockedCourseUnitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentLockedCourseUnitBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_locked_course_unit, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLockedCourseUnitBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentLockedCourseUnitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentLockedCourseUnitBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_locked_course_unit, null, false, component);
  }

  public static FragmentLockedCourseUnitBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentLockedCourseUnitBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentLockedCourseUnitBinding)bind(component, view, org.edx.mobile.R.layout.fragment_locked_course_unit);
  }
}
