package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class PanelFindCourseBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton courseBtn;

  @NonNull
  public final TextView findcourseTv;

  @NonNull
  public final LinearLayout panelCourseLayout;

  protected PanelFindCourseBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton courseBtn, TextView findcourseTv,
      LinearLayout panelCourseLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.courseBtn = courseBtn;
    this.findcourseTv = findcourseTv;
    this.panelCourseLayout = panelCourseLayout;
  }

  @NonNull
  public static PanelFindCourseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PanelFindCourseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PanelFindCourseBinding>inflate(inflater, org.edx.mobile.R.layout.panel_find_course, root, attachToRoot, component);
  }

  @NonNull
  public static PanelFindCourseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PanelFindCourseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PanelFindCourseBinding>inflate(inflater, org.edx.mobile.R.layout.panel_find_course, null, false, component);
  }

  public static PanelFindCourseBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static PanelFindCourseBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (PanelFindCourseBinding)bind(component, view, org.edx.mobile.R.layout.panel_find_course);
  }
}
