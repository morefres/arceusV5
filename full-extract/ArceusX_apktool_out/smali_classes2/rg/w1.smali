.class public final synthetic Lrg/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic a:Lrg/y1;

.field public final synthetic b:Le4/q;


# direct methods
.method public synthetic constructor <init>(Lrg/y1;Le4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrg/w1;->a:Lrg/y1;

    iput-object p2, p0, Lrg/w1;->b:Le4/q;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    iget-object v0, p0, Lrg/w1;->a:Lrg/y1;

    iget-object v1, p0, Lrg/w1;->b:Le4/q;

    invoke-static {v0, v1, p1}, Lrg/y1;->d2(Lrg/y1;Le4/q;Landroid/content/DialogInterface;)V

    return-void
.end method
