.class public final synthetic Lpr/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lpr/g1;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;


# direct methods
.method public synthetic constructor <init>(Lpr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpr/t0;->a:Lpr/g1;

    iput-object p2, p0, Lpr/t0;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpr/t0;->a:Lpr/g1;

    iget-object v1, p0, Lpr/t0;->b:Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/ui/k$b;

    invoke-static {v0, v1, p1}, Lpr/g1;->w(Lpr/g1;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lcom/withpersona/sdk2/inquiry/ui/k$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
