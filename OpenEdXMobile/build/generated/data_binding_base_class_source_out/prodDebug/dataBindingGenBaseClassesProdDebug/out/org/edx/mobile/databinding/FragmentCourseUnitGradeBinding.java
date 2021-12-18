package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import org.edx.mobile.view.custom.IconImageViewXml;

public abstract class FragmentCourseUnitGradeBinding extends ViewDataBinding {
  @NonNull
  public final IconImageViewXml contentErrorIcon;

  @NonNull
  public final TextView notAvailableMessage;

  @NonNull
  public final TextView notAvailableMessage2;

  @NonNull
  public final AppCompatButton viewOnWebButton;

  protected FragmentCourseUnitGradeBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, IconImageViewXml contentErrorIcon, TextView notAvailableMessage,
      TextView notAvailableMessage2, AppCompatButton viewOnWebButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contentErrorIcon = contentErrorIcon;
    this.notAvailableMessage = notAvailableMessage;
    this.notAvailableMessage2 = notAvailableMessage2;
    this.viewOnWebButton = viewOnWebButton;
  }

  @NonNull
  public static FragmentCourseUnitGradeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCourseUnitGradeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCourseUnitGradeBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_course_unit_grade, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCourseUnitGradeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentCourseUnitGradeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentCourseUnitGradeBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_course_unit_grade, null, false, component);
  }

  public static FragmentCourseUnitGradeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentCourseUnitGradeBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentCourseUnitGradeBinding)bind(component, view, org.edx.mobile.R.layout.fragment_course_unit_grade);
  }
}
