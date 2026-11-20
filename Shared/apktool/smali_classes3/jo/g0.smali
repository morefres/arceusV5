.class public final synthetic Ljo/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lwm/k$a;

.field public final synthetic b:Lsr/a;


# direct methods
.method public synthetic constructor <init>(Lwm/k$a;Lsr/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljo/g0;->a:Lwm/k$a;

    iput-object p2, p0, Ljo/g0;->b:Lsr/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ljo/g0;->a:Lwm/k$a;

    iget-object v1, p0, Ljo/g0;->b:Lsr/a;

    invoke-static {v0, v1}, Ljo/t0;->o(Lwm/k$a;Lsr/a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
