.class public final synthetic Lfp/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lfp/n0;


# direct methods
.method public synthetic constructor <init>(Lfp/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/l0;->a:Lfp/n0;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object v0, p0, Lfp/l0;->a:Lfp/n0;

    invoke-static {v0, p1, p2}, Lfp/n0;->a(Lfp/n0;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
