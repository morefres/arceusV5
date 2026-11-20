.class public final synthetic Lmr/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lmr/a2;


# direct methods
.method public synthetic constructor <init>(Lmr/a2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmr/y1;->a:Lmr/a2;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lmr/y1;->a:Lmr/a2;

    invoke-static {v0, p1}, Lmr/a2;->f(Lmr/a2;Landroid/view/View;)V

    return-void
.end method
