.class public final synthetic Ldj/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/j;


# instance fields
.field public final synthetic a:Ldj/a0;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ldj/a0;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldj/p;->a:Ldj/a0;

    iput-object p2, p0, Ldj/p;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a(Lcom/android/billingclient/api/d;Lv7/n;)V
    .locals 2

    iget-object v0, p0, Ldj/p;->a:Ldj/a0;

    iget-object v1, p0, Ldj/p;->b:Ljava/lang/Runnable;

    invoke-static {v0, v1, p1, p2}, Ldj/a0;->p(Ldj/a0;Ljava/lang/Runnable;Lcom/android/billingclient/api/d;Lv7/n;)V

    return-void
.end method
