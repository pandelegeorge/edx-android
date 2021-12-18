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
import org.edx.mobile.view.custom.IconImageViewXml;

public abstract class ContentErrorBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout contentError;

  @NonNull
  public final AppCompatButton contentErrorAction;

  @NonNull
  public final IconImageViewXml contentErrorIcon;

  @NonNull
  public final TextView contentErrorText;

  protected ContentErrorBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout contentError, AppCompatButton contentErrorAction,
      IconImageViewXml contentErrorIcon, TextView contentErrorText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contentError = contentError;
    this.contentErrorAction = contentErrorAction;
    this.contentErrorIcon = contentErrorIcon;
    this.contentErrorText = contentErrorText;
  }

  @NonNull
  public static ContentErrorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ContentErrorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ContentErrorBinding>inflate(inflater, org.edx.mobile.R.layout.content_error, root, attachToRoot, component);
  }

  @NonNull
  public static ContentErrorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ContentErrorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ContentErrorBinding>inflate(inflater, org.edx.mobile.R.layout.content_error, null, false, component);
  }

  public static ContentErrorBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ContentErrorBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ContentErrorBinding)bind(component, view, org.edx.mobile.R.layout.content_error);
  }
}
