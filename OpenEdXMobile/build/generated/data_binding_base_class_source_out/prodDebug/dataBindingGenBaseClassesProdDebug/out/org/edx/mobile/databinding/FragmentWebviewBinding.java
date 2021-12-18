package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import org.edx.mobile.view.custom.EdxWebView;

public abstract class FragmentWebviewBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout contentErrorRoot;

  @NonNull
  public final LoadingIndicatorBinding loadingIndicator;

  @NonNull
  public final EdxWebView webview;

  protected FragmentWebviewBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, FrameLayout contentErrorRoot, LoadingIndicatorBinding loadingIndicator,
      EdxWebView webview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.contentErrorRoot = contentErrorRoot;
    this.loadingIndicator = loadingIndicator;
    setContainedBinding(this.loadingIndicator);;
    this.webview = webview;
  }

  @NonNull
  public static FragmentWebviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentWebviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentWebviewBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_webview, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentWebviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentWebviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentWebviewBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_webview, null, false, component);
  }

  public static FragmentWebviewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentWebviewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentWebviewBinding)bind(component, view, org.edx.mobile.R.layout.fragment_webview);
  }
}
