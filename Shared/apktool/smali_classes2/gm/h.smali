.class public final synthetic Lgm/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/g;


# instance fields
.field public final synthetic a:Lg/c;

.field public final synthetic b:Lgm/l$b;


# direct methods
.method public synthetic constructor <init>(Lg/c;Lgm/l$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgm/h;->a:Lg/c;

    iput-object p2, p0, Lgm/h;->b:Lgm/l$b;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lgm/h;->a:Lg/c;

    iget-object v1, p0, Lgm/h;->b:Lgm/l$b;

    check-cast p1, Landroid/app/PendingIntent;

    invoke-static {v0, v1, p1}, Lgm/l;->b(Lg/c;Lgm/l$b;Landroid/app/PendingIntent;)V

    return-void
.end method
