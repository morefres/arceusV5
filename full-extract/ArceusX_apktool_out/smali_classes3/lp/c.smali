.class public final synthetic Llp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Llp/a;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/StringBuilder;


# direct methods
.method public synthetic constructor <init>(Llp/a;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llp/c;->a:Llp/a;

    iput-object p2, p0, Llp/c;->b:Ljava/lang/String;

    iput-object p3, p0, Llp/c;->c:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Llp/c;->a:Llp/a;

    iget-object v1, p0, Llp/c;->b:Ljava/lang/String;

    iget-object v2, p0, Llp/c;->c:Ljava/lang/StringBuilder;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Llp/b$e;->o(Llp/a;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
