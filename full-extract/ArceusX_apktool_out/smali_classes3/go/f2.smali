.class public final synthetic Lgo/f2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lwm/k$a;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lwm/k$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgo/f2;->a:Lwm/k$a;

    iput-boolean p2, p0, Lgo/f2;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lgo/f2;->a:Lwm/k$a;

    iget-boolean v1, p0, Lgo/f2;->b:Z

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->f(Lwm/k$a;ZLjava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
